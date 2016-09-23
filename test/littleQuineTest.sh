
cd ..
echo "Building..."
javac -o LittleQuine.class src/LittleQuine.java 
echo "Executing..."
java src/LittleQuine.class > generated.txt
echo "Checking..."
diff src/LittleQuine.java generated.txt 


if ! diff -q a b > /dev/null  2>&1; then
  echo "NOK - Replication failed"
else
  echo "OK - Replication succeeded"
fi

