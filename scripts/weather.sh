#!/bin/bash

CITY="TelAviv"

echo "--- Current Weather in $CITY ---"
# take weather data from wttr.in (0 means current weather only)
curl -s "wttr.in/${CITY}?0"
echo "--------------------------------"
