class Solution {
    public String[] assignUmbrella(int[] rain) {
        int n=rain.length;
        String[] ans=new String[n];
        int a=0;
        int b=0;
        
        for(int i=0;i<n-1;i++){
            if(rain[i]==0){
                ans[i]="None";
            }
            else if(rain[i]==1 && rain[i+1]==1){
                if(a<=b){
                    ans[i]="Alice";
                    a++;
                }
                else{
                    ans[i]="Bob";
                    b++;
                }
            }
            else{
                ans[i]="Bob";
                b++;
            }
        }

        if(rain[n-1]==0){
            ans[n-1]="None";
        }
        else{
            ans[n-1]="Bob";
            b++;
        }
        return ans;
    }
}
