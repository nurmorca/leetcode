func reverseString(s []byte)  {
    var x byte;
    sLength := len(s) - 1;
    loopSize := len(s) / 2;

    for i := range loopSize {
        x = s[i];
        s[i] = s[sLength - i];
        s[sLength - i] = x;
    }
}