int strStr(char* haystack, char* needle) {
    int i = 0, counter =0;;
    int j;
    
    if(strlen(haystack) >= strlen(needle)){       
        do{
            j = 0;          
            printf("%d", i);
            while(needle[j] == haystack[i] && needle[j] != '\0'){
                i++;
                j++;
            }
            if(needle[j] == '\0'){
                return i - j;
            }
            counter++;
            i = counter;
        } while(haystack[i] != '\0');
    }
    
    return -1;
    
}