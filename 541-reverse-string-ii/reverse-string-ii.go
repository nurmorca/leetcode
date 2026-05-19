func reverseStr(s string, k int) string {

    b := []byte(s)
    flag := true
    var ind int

   ind = min(k, len(s))

   for i := 0; i < len(s); i += k {
        if flag && (len(s) - 1 - i) > 1 {
            ind = min(len(s)-i, k)
          for y := 0; y < (ind / 2); y++ {
               x := b[i + y]
               b[i + y] = b[i + ind - 1 - y]
               b[i + ind - 1 - y] = x
            }
        }
        flag = !flag
    } 

   return string(b)
}