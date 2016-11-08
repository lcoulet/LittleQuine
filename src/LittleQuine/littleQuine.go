package main

import "fmt"
import "strings" 

func main() {
    var txt="package main\r\n\r\nimport \"fmt\"\r\nimport \"strings\" \r\n\r\nfunc main() {\r\n    var txt=\"HELLO_WORLD\"\r\n    var txt2=strings.Replace(strings.Replace(strings.Replace(txt,\"\\\\\",\"\\\\\\\\\",-1),\"\\\"\",\"\\\\\\\"\",-1),\"\\r\\n\",\"\\\\r\\\\n\",-1)\r\n    txt=strings.Replace(txt,\"HELLO_WORLD\",txt2,1)\r\n    fmt.Printf(txt)\r\n}\r\n\r\n"
    var txt2=strings.Replace(strings.Replace(strings.Replace(txt,"\\","\\\\",-1),"\"","\\\"",-1),"\r\n","\\r\\n",-1)
    txt=strings.Replace(txt,"HELLO_WORLD",txt2,1)
    fmt.Printf(txt)
}

