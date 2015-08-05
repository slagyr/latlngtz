(ns latlngtz.mapper
  (:import (latlngtz TimezoneMapper)))

(defn latlng->tz [^double lat ^double lng]
  (TimezoneMapper/latLngToTimezoneString lat lng))
