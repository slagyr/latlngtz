(ns latlngtz.mapper-spec
  (:require [speclj.core :refer :all]
            [latlngtz.mapper :refer :all]))

(describe "Lat/Lng TimeZone Mapper"

  (it "Sydney" (should= "Australia/Sydney" (latlng->tz -33 151)))
  (it "Helsinki" (should= "Europe/Helsinki" (latlng->tz 60.173154 24.940936)))
  (it "London" (should= "Europe/London" (latlng->tz 51.516007 -0.121644)))
  (it "Paris" (should= "Europe/Paris" (latlng->tz 48.856696 2.352077)))
  (it "Tallinn" (should= "Europe/Tallinn" (latlng->tz 59.438442 24.753463)))
  (it "Jeddah" (should= "Asia/Riyadh" (latlng->tz 21.518043 39.191228)))
  (it "Chattanooga" (should= "America/New_York" (latlng->tz 35.03217 -85.193928)))
  (it "Gold Coast" (should= "Australia/Brisbane" (latlng->tz -28.019981 153.428073)))
  (it "Oulu (Finland)" (should= "Europe/Helsinki" (latlng->tz 65.012197 25.471152)))

  (it "C81" (should= "America/Chicago" (latlng->tz 42.3246111 -88.0740881)))
  (it "BTR" (should= "America/Chicago" (latlng->tz 30.5329058 -91.1498769)))
  (it "LAX" (should= "America/Los_Angeles" (latlng->tz 33.9425003 -118.4080736)))
  (it "TEB" (should= "America/New_York" (latlng->tz 40.8501111 -74.0608333)))
  )

