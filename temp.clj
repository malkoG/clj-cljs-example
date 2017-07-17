(defn upper-caser
    [in]
    (let [out (chan)]
        (go (while true (>! out (clojure.string/upper-case (<! in)))))))

(defn reverser
    [in]
    (let [out (chan)]
        (go (while true (>! out (clojure.string/reverse (<! in)))))))

(defn printer
    [in]
    (go (while true (println (<! in)))))

(def in-chan (chan))
(def upper-caser-out (upper-caser in-chan))
(def reverser-out (reverser upper-caser-out))
(printer reverser-out)

(>!! in-chan "redrum")