#!/bin/sh -

# taken from https://github.com/harrah/xsbt/wiki/Setup
java_options="-Dfile.encoding=UTF8 -Xms512M -Xmx1536M -Xss1M -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=384M"
sbt_command="java $java_options -jar project/sbt_0-11-3.jar"

case $1 in
  a | assemble)
    $sbt_command update assembly;;
  
  c | console)
    $sbt_command update console;;
    
  d | devloop)
    $sbt_command update ~test;;
    
  l | libraries)
    $sbt_command library-dependencies | grep List;;
    
  r | run)
    $sbt_command update run;;
    
  s | sbt)
    $sbt_command;;
    
  *)
    echo "specify a command: (a)ssemble, (c)onsole, (d)evloop, (l)ibraries, (r)un, (s)bt";;
esac
