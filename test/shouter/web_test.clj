(ns shouter.web-test
  (:require [clojure.test :refer :all]
            [ring.mock.request :as mock]
            [shouter.web :refer :all]))

(deftest test-app
  (testing "main route"
    (let [response (application (mock/request :get "/"))]
      (is (= (:status response) 200))
      (is (.contains (:body response) "What do you want to SHOUT?"))))

  (testing "not-found route"
    (let [response (application (mock/request :get "/invalid"))]
      (is (= (:status response) 404)))))
