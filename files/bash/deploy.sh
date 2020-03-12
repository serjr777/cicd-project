#!/bin/bash

#read -p "Enter version of bookstore image in dockerhub:"  image

docker login --username <username> --password <password>


docker stop bookstore
docker rm bookstore

docker image prune -a -f  #remove unusable images

docker run -d -it --name=bookstore -p 80:8080 serjr777/bookstore:$1
