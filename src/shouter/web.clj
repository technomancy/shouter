(ns shouter.web
  (:require [compojure.core :refer [defroutes]]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [shouter.controllers.shouts :as shouts]
            [shouter.views.layout :as layout])
  (:gen-class))

(defroutes routes
  shouts/routes
  (route/resources "/")
  (route/not-found (layout/four-oh-four)))

(def application (wrap-defaults routes site-defaults))
