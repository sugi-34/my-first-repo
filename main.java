class Main {
    public static void main(String[] args) {
      // 変数nameに、好きな名前を代入してください
      String name = "小杉紗代";
      
      // 変数ageに、好きな年齢を代入してください
      int age = 28;
      
      // 変数heightに、好きな身長を代入してください（例: 1.2）
      double height = 1.6;
      
      // 変数weightに、好きな体重を代入してください（例: 20.0）
      double weight = 50.2;
      
      // 変数bmiに、BMIを計算して代入してください
      double bmi = weight / height / height;
      
      // 名前、年齢、身長、体重、BMIに関する情報を出力してください
      System.out.println("名前は" + name + "です");
      System.out.println("年齢は" + age +"歳です");
      System.out.println("身長は" + height + "mです");
      System.out.println("体重は" + weight + "kgです");
      System.out.println("BMIは" + bmi + "です");
    }
  }