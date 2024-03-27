#!/bin/bash

DB_NAME=${DB_NAME:-moneysend}
DB_USER=${DB_USER:-moneysend}
DB_PASS=${DB_PASS:-moneysend}
sed -i -e "s/###DB_NAME###/${DB_NAME}/" \
       -e "s/###DB_USER###/${DB_USER}/" \
       -e "s/###DB_PASS###/${DB_PASS}/" \
  application.properties
cat application.properties
