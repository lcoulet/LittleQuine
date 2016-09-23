
cd ..
echo "Building..."
javac src/LittleQuine.java 
echo "Executing..."
java -cp src/ LittleQuine > generated.txt
echo "Checking..."


if ! diff  --ignore-all-space -q  src/LittleQuine.java generated.txt  > /dev/null  2>&1; then
  echo "NOK - Replication failed"
else
  echo "OK - Replication succeeded"
fi

