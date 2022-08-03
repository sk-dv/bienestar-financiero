(ns bienestar-financiero.prod
  (:require [bienestar-financiero.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
