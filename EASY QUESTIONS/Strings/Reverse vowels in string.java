class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int st = 0;
        int end = n - 1;

        while (st < end) {
            if (arr[st] != 'a' && arr[st] != 'e' && arr[st] != 'i' &&
                    arr[st] != 'o' && arr[st] != 'u' &&
                    arr[st] != 'A' && arr[st] != 'E' && arr[st] != 'I' &&
                    arr[st] != 'O' && arr[st] != 'U') {

                st++;
            }

            else if (arr[end] != 'a' && arr[end] != 'e' && arr[end] != 'i' &&
                    arr[end] != 'o' && arr[end] != 'u' &&
                    arr[end] != 'A' && arr[end] != 'E' && arr[end] != 'I' &&
                    arr[end] != 'O' && arr[end] != 'U') {

                end--;
            } else {
                char temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }
        }
        return new String(arr);
    }
}