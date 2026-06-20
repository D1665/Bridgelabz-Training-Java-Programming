#!/bin/bash

# Exit immediately if a command exits with a non-zero status
set -e

# Base directory of the script
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
cd "$DIR"

echo "Compiling Address Book Java Application..."
mkdir -p bin
find src/main/java -name "*.java" > sources.txt
javac -d bin -cp "lib/*" @sources.txt
rm -f sources.txt
echo "Compilation successful!"

echo "Starting Application..."
java -cp "bin:src/main/resources:lib/*" com.addressbook.AddressBookApp
