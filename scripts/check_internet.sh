#!/bin/bash

echo "--- Internet Connection Check Log ---"
echo "Date: $(date)"

# Ping Google DNS once to check connection
ping -c 1 8.8.8.8 > /dev/null 2>&1

if [ $? -eq 0 ]; then
    echo "Status: Connected to the internet."
else
    echo "Status: No internet connection."
fi
echo "-------------------------------------"



