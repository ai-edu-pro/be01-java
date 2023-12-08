package quiz.IO.bmiFour;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BmiRepository extends Bmi {  // Controller

    private static HashMap<Integer,Bmi> bmiList = new HashMap<Integer,Bmi>();
    private static int num = 1;

    public BmiRepository() {

    }

    public void add() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("이름 입력 : ");   String name = br.readLine();
            System.out.print("신장 입력 : ");   double height = Double.parseDouble(br.readLine());
            System.out.print("체중 입력 : ");   double weight = Double.parseDouble(br.readLine());
            System.out.print("성별 입력 (m:남성 / f:여성) : ");   char tmp = br.readLine().charAt(0);
            boolean gender = (tmp == 'm');
            double bmi = getBmi(height, weight);
            String status = getBmiStatus(bmi);

            Bmi b = new Bmi(name,height,weight,gender,bmi,status);
            bmiList.put(num++,b);

            System.out.println("정보 입력이 완료되었습니다.");
        }
        catch(NumberFormatException e){
            System.out.println("입력이 잘못되었습니다.");
        }
    }

    public void del() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try{
            System.out.print("삭제할 유저의 ID를 입력하세요 : ");
            n = Integer.parseInt(br.readLine());
        }
        catch(NumberFormatException e){
            System.out.println("존재하지 않는 ID 입니다.");
            return;
        }
        if(bmiList.containsKey(n)){
            bmiList.remove(n); //
            System.out.println("삭제가 완료되었습니다.");
        }
        else{
            System.out.println("존재하지 않는 ID 입니다.");
        }

    }

    public void print() {
        Iterator it = bmiList.entrySet().iterator();

        while (it.hasNext()){
            Map.Entry bmiEntry = (Map.Entry)it.next();
            Bmi b = (Bmi)bmiEntry.getValue();
            System.out.println("ID : " + bmiEntry.getKey());
            System.out.println(b);
        }
        System.out.println("=========================");
    }

    public void edit() throws IOException{
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try{
            System.out.print("수정할 유저의 ID를 입력하세요 : ");
            n = Integer.parseInt(br.readLine());
        }
        catch(NumberFormatException e){
            System.out.println("존재하지 않는 ID 입니다.");
            return;
        }

        if(bmiList.containsKey(n)){
            try{
                System.out.print("이름 입력 : ");   String name = br.readLine();
                System.out.print("신장 입력 : ");   double height = Double.parseDouble(br.readLine());
                System.out.print("체중 입력 : ");   double weight = Double.parseDouble(br.readLine());
                System.out.print("성별 입력 (m:남성 / f:여성) : ");   char tmp = br.readLine().charAt(0);
                boolean gender = (tmp == 'm');
                double bmi = getBmi(height, weight);
                String status = getBmiStatus(bmi);

                Bmi b = new Bmi(name,height,weight,gender,bmi,status);
                bmiList.put(n,b);

                System.out.println("정보 수정이 완료되었습니다.");
            }
            catch(NumberFormatException e){
                System.out.println("입력이 잘못되었습니다.");
                return;
            }
        }
        else{
            System.out.println("존재하지 않는 ID 입니다.");
        }
    }

    // HashMap 객체로 .txt로 저장
    public void printTxt() throws IOException {
    	
        System.out.println("사용자들의 BMI 정보를 .txt로 저장합니다.");

        OutputStream os = new FileOutputStream("bmi.txt");
        ObjectOutputStream oos = new ObjectOutputStream(os);

        oos.writeObject(bmiList);
    }

    // 파일을 읽고 내용 출력 후 데이터를 리스트에 추가
    public void readTxt() throws IOException, ClassNotFoundException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("읽을 파일 명을 입력하세요 : ");
        String path = br.readLine();

        try{
            InputStream is = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(is);

            HashMap<Integer,Bmi> txtBmiList = (HashMap<Integer,Bmi>)ois.readObject();
            System.out.println(txtBmiList);
            System.out.print("\n텍스트 파일 명단을 추가하시겠습니까?(y/n) : ");
            char ch = br.readLine().charAt(0);
            
            if(ch == 'y' || ch == 'Y') {
                Iterator it = txtBmiList.entrySet().iterator();
                while(it.hasNext()){
                    Map.Entry bmi = (Map.Entry)it.next();
                    bmiList.put(num++,(Bmi)bmi.getValue());
                }
            }
        }
        catch(EOFException e){
            System.out.println("파일에 관련된 내용이 없습니다.");
        }
        catch(FileNotFoundException e){
            System.out.println("파일이 없습니다.");
        }
        catch(Exception e){
            System.out.println("파일 오류" + e);
        }
    }

    public double getBmi(double height, double weight){
        return Math.round((weight) / Math.pow(height/100,2)* 100) / 100.0;      // 소수점 둘째 자리 까지만
    }

    public String getBmiStatus(double bmi){
        if(bmi < 18.5)
            return "저체중";
        else if(bmi >= 18.5 && bmi < 23)
            return "정상";
        else if(bmi >= 23 && bmi < 25)
            return "비만위험";
        else if(bmi >= 25 && bmi < 30)
            return "비만 1단계";
        else if(bmi >= 30 && bmi < 35)
            return "비만 2단계";
        else
            return "비만 3단계";
    }
}
