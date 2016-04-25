package jaket;
public class jaket {
    private final int jaketA = 100000;
    private final int jaketB = 125000;
    private final int jaketC = 175000;
    private int jumlah;
    private int totalA,totalB,totalC,TotalFinal;
    public void JaketA(int a){
        jumlah = a;
        if(jumlah>100){
            totalA= jumlah*95000;}
        else{
            totalA=jumlah*jaketA;}}
    public int getTotalA(){
        return totalA;}
    public void JaketB(int a){
        jumlah = a;
        if(jumlah>100){
            totalB=jumlah*120000;}
        else{
            totalB=jumlah*jaketB;}}
    public int getTotalB(){
        return totalB;}   
    public void JaketC(int a){
        jumlah = a;
        if(jumlah>100){
            totalC=jumlah*160000;}
        else{
            totalC=jumlah*jaketC;}}
    public int getTotalC(){
        return totalC;}
    public void Total(){
TotalFinal=totalA+totalB+totalC;}
    public int getTotal(){
        return TotalFinal;
    }
}
