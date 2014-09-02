(ns shouter.controllers.shouts
  (:require [compojure.core :refer [defroutes GET POST]]
            [clojure.string :as str]
            [ring.util.response :as ring]
            [shouter.views.shouts :as view]
            [shouter.models.shout :as model]))

(defn index []
  (view/index (model/all)))

(defn create
  [shout]
  (when-not (or (str/blank? shout)
                (> (count shout) 512))
    (model/create shout))
  (ring/redirect "/"))

(defroutes routes
  (GET  "/" [] (index))
  (POST "/" [shout] (create shout)))
