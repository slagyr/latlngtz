# latlngtz

Clojure wrapper for Tim Coopers Java code: http://www.edval.biz/mapping-lat-lng-s-to-timezones

<pre>
What's the quickest & easiest way to map lat/lng's to timezones, if you don't want to be relying on a web service to do this mapping?

I took shapefiles from here:   http://efele.net/maps/tz/world/
 
I processed them into json according to a C library I found referenced in here:
          http://en.wikipedia.org/wiki/Shapefile

Then I created a "lat,lng to timezone approximator" Java class, see below.  This class is nice and small and quick, the data is embedded in the code as 100's of 'if' statements implementing a 2kd-tree.  Also, since there's nothing other than if's and returns, the code can be used with very little work in C#, C++, JavaScript, PHP etc., (although you'd want a compiled language!).   The 500K .java file is accurate to half a degree, 55km at worst.  The 1.1Mb .java file is accurate to 0.25 of a degree, 22km at worst.

Then I realised that 22km was still producing a lot of errors, because a lot of cities are within 22km of a timezone boundary, e.g. Gold Coast QLD, Chattanooga.  Note - within 22km of a coast mostly works due to a custom rule I created, but still suspect there are some occasional errors there.

So I developed the '2km' version which uses a variety of techniques including polygons. But this is more effort to port to other languages. 

If anyone wants the .json file of the polygons, which should be fully accurate if you can write code that makes sense of it, then email me on tim @ edval.com.au - the file is too big for Google Sites, 29Mb compressed.  But it's dated late 2013, so doesn't have the change in Crimea.

The provided code is available under GPL:   https://www.gnu.org/copyleft/gpl.html 
</pre>

The last (2km) version is used in this library.

