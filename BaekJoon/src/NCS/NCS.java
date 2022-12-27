package NCS;

import java.util.ArrayList;
import java.util.List;

public class NCS {
    public static void main(String[] args) {
        // 사칙연산[s]
        int[] arr_2005 = new int[4];
        int[] arr_2006 = new int[4];
        int[] arr_2007 = new int[4];
        int[] arr_2008 = new int[4];

        List<int[]> fourRuleArr = new ArrayList<>();
        fourRuleArr.add(arr_2005);
        fourRuleArr.add(arr_2006);
        fourRuleArr.add(arr_2007);
        fourRuleArr.add(arr_2008);

        String[] firstArr = {"2005","2006","2007","2008"};

        for(int i = 0; i < arr_2005.length; ++i) {
            arr_2005[i] = (int) (Math.random() * 90) + 10;
            arr_2006[i] = (int) (Math.random() * 90) + 10;
            arr_2007[i] = (int) (Math.random() * 90) + 10;
            arr_2008[i] = (int) (Math.random() * 90) + 10;
        }
        System.out.println("# 사칙연산");

        System.out.println("---------------------------사칙연산 Start----------------------------------");
        System.out.println("     "+2005 + "  " + 2006 + "  "+ 2007 + "  " + 2008);
        for(int i = 0; i < 4; ++i) {

            System.out.print(i+1+"0대: " +arr_2005[i] + "    " + arr_2006[i] + "    " +arr_2007[i] + "     " +arr_2008[i]);
            System.out.println();
        }
        System.out.println("---------------------------사칙연산 End------------------------------------");

        int beforeRanNum = Integer.MIN_VALUE;
        for(int i = 0; i < 2; ++i) {
            int ranOneNum = (int) (Math.random() * 4);
            while(true) {
                if(ranOneNum == beforeRanNum) {
                    ranOneNum = (int) (Math.random() * 4);
                } else break;
            }
            beforeRanNum = ranOneNum;

            System.out.print(i+1+"번) "+firstArr[ranOneNum] + "년 전체 합은? ");

            int firstQuestionResult = 0;
            for(int x : fourRuleArr.get(ranOneNum)) {
                firstQuestionResult += x;
            }
            System.out.println(firstQuestionResult);
        }

        String[] whereAge = {"10대","20대","30대","40대"};

        int beforeRanOneNum = Integer.MIN_VALUE;
        int beforeRanOneNumWihtout_0 = Integer.MIN_VALUE;

        for(int i = 0; i < 2; ++i) {
            int ranOneNum = (int) (Math.random() * 4);
            int ranOneNumWithout_0 = (int) (Math.random() * 3 + 1);

            while(true) {
                if(ranOneNum == beforeRanOneNum) {
                    ranOneNum = ren(beforeRanOneNum);
                    break;
                } else break;
            }
            while(true) {
                if(ranOneNumWithout_0 == beforeRanOneNumWihtout_0) {
                    ranOneNumWithout_0 = ren_withOut_0(beforeRanOneNumWihtout_0);
                    break;
                } else break;
            }
            beforeRanOneNum = ranOneNum;
            beforeRanOneNumWihtout_0 = ranOneNumWithout_0;

            System.out.print(i+3+"번) "+firstArr[ranOneNumWithout_0] + "년 " + whereAge[ranOneNum] + "의 전년도 대비 증가 or 감소율? ");
            int[] currentYear = fourRuleArr.get(ranOneNumWithout_0);
            int[] beforeYear = fourRuleArr.get(ranOneNumWithout_0 - 1);

            int i1 = currentYear[ranOneNum];
            int i2 = beforeYear[ranOneNum];
            char plusMinus = '+';
            if(i1 < i2) {
                plusMinus = '-';
            }
            int pM = Math.abs(i1 - i2);
            String format = String.format("%.2f", (double) pM / (double) i2);
            System.out.println(plusMinus + format + "%");
        }
        // 사칙연산[e]

        // 분수[s]
        String[] whereAge2 = {"10대", "20대", "30대"};

        int[] arr_2010 = new int[3];
        int[] arr_2011 = new int[3];
        int[] arr_2012 = new int[3];
        int[] arr_2013 = new int[3];
        int[] arr_2014 = new int[3];

        List<int[]> fountainArr = new ArrayList<>();
        fountainArr.add(arr_2010);
        fountainArr.add(arr_2011);
        fountainArr.add(arr_2012);
        fountainArr.add(arr_2013);
        fountainArr.add(arr_2014);

        String[] secondArr = {"2010","2011","2012","2013","2014"};

        for(int i = 0; i < 3; ++i) {
            arr_2010[i] = (int) (Math.random() * 9000) + 1000;
            arr_2011[i] = (int) (Math.random() * 9000) + 1000;
            arr_2012[i] = (int) (Math.random() * 9000) + 1000;
            arr_2013[i] = (int) (Math.random() * 9000) + 1000;
            arr_2014[i] = (int) (Math.random() * 9000) + 1000;
        }
        int sum_2010 = 0;
        int sum_2011 = 0;
        int sum_2012 = 0;
        int sum_2013 = 0;
        int sum_2014 = 0;
        System.out.println();
        System.out.println("# 분수");
        System.out.println("---------------------------분수 Start----------------------------------");
        System.out.println("      "+2010 + "    " + 2011 + "    "+ 2012 + "     " + 2013 + "    " + 2014);
        for(int i = 0; i < 3; ++i) {
            System.out.print(i+1+"0대: " +arr_2010[i] + "    " + arr_2011[i] + "    " +arr_2012[i] + "     " +arr_2013[i] + "    " + arr_2014[i]);
            System.out.println();
            sum_2010 += arr_2010[i];
            sum_2011 += arr_2011[i];
            sum_2012 += arr_2012[i];
            sum_2013 += arr_2013[i];
            sum_2014 += arr_2014[i];
        }
        ArrayList<Integer> sumArr = new ArrayList<>();
        sumArr.add(sum_2010);
        sumArr.add(sum_2011);
        sumArr.add(sum_2012);
        sumArr.add(sum_2013);
        sumArr.add(sum_2014);
        System.out.println("전체: " +sum_2010 + "   " + sum_2011 + "   " + sum_2012 + "    " + sum_2013 + "   " + sum_2014);
        System.out.println("---------------------------분수 End------------------------------------");

        for(int i = 0; i < 4; ++i) {
            int ranNum = (int) (Math.random() * 5);
            int ranAgeNum = (int) (Math.random() * 3);

            int[] ints = fountainArr.get(ranNum);
            int anInt = ints[ranAgeNum];

            double ratio = (double) anInt / (double) sumArr.get(ranNum);
            String format2 = String.format("%.2f", ratio);

            System.out.print(i+1 +"번) " + secondArr[ranNum] + "년 " + whereAge2[ranAgeNum] + "의 비중은? ");
            System.out.println(format2 + "%");
        }
        // 분수[e]

        // 종합연습[s]
        int[] all_2010 = new int[3];
        int[] all_2011 = new int[3];
        int[] all_2012 = new int[3];
        int[] all_2013 = new int[3];
        int[] all_2014 = new int[3];

        List<int[]> allArr = new ArrayList<>();
        allArr.add(all_2010);
        allArr.add(all_2011);
        allArr.add(all_2012);
        allArr.add(all_2013);
        allArr.add(all_2014);

        String[] thirdArr = {"2010","2011","2012","2013","2014"};

        for(int i = 0; i < 3; ++i) {
            all_2010[i] = (int) (Math.random() * 90000) + 10000;
            all_2011[i] = (int) (Math.random() * 90000) + 10000;
            all_2012[i] = (int) (Math.random() * 90000) + 10000;
            all_2013[i] = (int) (Math.random() * 90000) + 10000;
            all_2014[i] = (int) (Math.random() * 90000) + 10000;
        }

        int all_sum_2010 = 0;
        int all_sum_2011 = 0;
        int all_sum_2012 = 0;
        int all_sum_2013 = 0;
        int all_sum_2014 = 0;
        String[] allMenu = {"취업인구     ","실업인구     ","비경제활동인구","경제활동인구  ","전체인구     ","고용률      ","실업률      "};
        System.out.println();
        System.out.println("# 종합연습");
        System.out.println("---------------------------종합연습 Start----------------------------------");
        System.out.println("               "+2010 + "       " + 2011 + "       "+ 2012 + "        " + 2013 + "       " + 2014);

        for(int i = 0; i < 2; ++i) {
            all_sum_2010 += all_2010[i];
            all_sum_2011 += all_2011[i];
            all_sum_2012 += all_2012[i];
            all_sum_2013 += all_2013[i];
            all_sum_2014 += all_2014[i];
        }

        ArrayList<Integer> allSumArr = new ArrayList<>();
        allSumArr.add(all_sum_2010);
        allSumArr.add(all_sum_2011);
        allSumArr.add(all_sum_2012);
        allSumArr.add(all_sum_2013);
        allSumArr.add(all_sum_2014);

        for(int i = 0; i < 3; ++i) {
            System.out.println(allMenu[i]+"   "+ all_2010[i]+ "      " + all_2011[i] + "      "+ all_2012[i] + "       " + all_2013[i] + "      " + all_2014[i]);
        }
        System.out.println(allMenu[3]+"   "+ allSumArr.get(0)+ "      " + allSumArr.get(1) + "     "+ allSumArr.get(2) + "      " + allSumArr.get(3) + "      " + allSumArr.get(4));

        int allPeople_2010 = allSumArr.get(0)+all_2010[2];
        int allPeople_2011 = allSumArr.get(1)+all_2011[2];
        int allPeople_2012 = allSumArr.get(2)+all_2012[2];
        int allPeople_2013 = allSumArr.get(3)+all_2013[2];
        int allPeople_2014 = allSumArr.get(4)+all_2014[2];

        System.out.println(allMenu[4]+"   "+ allPeople_2010+ "     " + allPeople_2011 + "     "+ allPeople_2012 + "      " + allPeople_2013 + "     " + allPeople_2014);

        double hireP_2010 = ((double)all_2010[0] / (double) allPeople_2010) * 100;
        String h2010 = String.format("%.2f", hireP_2010);

        double hireP_2011 = ((double)all_2011[0] / (double) allPeople_2011) * 100;
        String h2011 = String.format("%.2f", hireP_2011);

        double hireP_2012 = ((double)all_2012[0] / (double) allPeople_2012) * 100;
        String h2012 = String.format("%.2f", hireP_2012);

        double hireP_2013 = ((double)all_2013[0] / (double) allPeople_2013) * 100;
        String h2013 = String.format("%.2f", hireP_2013);

        double hireP_2014 = ((double)all_2014[0] / (double) allPeople_2014) * 100;
        String h2014 = String.format("%.2f", hireP_2014);

        double[] hireArr = new double[5];
        hireArr[0] = hireP_2010;
        hireArr[1] = hireP_2011;
        hireArr[2] = hireP_2012;
        hireArr[3] = hireP_2013;
        hireArr[4] = hireP_2014;


        System.out.println(allMenu[5]+"   "+ h2010+ "%     " + h2011 + "%     "+ h2012 + "%      " + h2013 + "%     " + h2014 +"%");

        double lostP_2010 = ((double)all_2010[1] / (double) allSumArr.get(0)) * 100;
        String l2010 = String.format("%.2f", lostP_2010);

        double lostP_2011 = ((double)all_2011[1] / (double) allSumArr.get(1)) * 100;
        String l2011 = String.format("%.2f", lostP_2011);

        double lostP_2012 = ((double)all_2012[1] / (double) allSumArr.get(2)) * 100;
        String l2012 = String.format("%.2f", lostP_2012);

        double lostP_2013 = ((double)all_2013[1] / (double) allSumArr.get(3)) * 100;
        String l2013 = String.format("%.2f", lostP_2013);

        double lostP_2014 = ((double)all_2014[1] / (double) allSumArr.get(4)) * 100;
        String l2014 = String.format("%.2f", lostP_2014);

        double[] loastArr = new double[5];
        loastArr[0] = lostP_2010;
        loastArr[1] = lostP_2011;
        loastArr[2] = lostP_2012;
        loastArr[3] = lostP_2013;
        loastArr[4] = lostP_2014;


        System.out.println(allMenu[6]+"   "+ l2010+ "%     " + l2011 + "%     "+ l2012 + "%       " + l2013 + "%      " + l2014 +"%");

        System.out.println("---------------------------종합연습 End------------------------------------");
        // 종합연습[e]

        int beforeNum = (int) (Math.random() * 4 + 1);
        String beforeYear = thirdArr[beforeNum];
        int afterNum = ren_last(beforeNum);
        String afterYear = thirdArr[afterNum];

        double b_dif = Math.abs(loastArr[beforeNum] - loastArr[beforeNum - 1]);
        double a_dif = Math.abs(loastArr[afterNum] - loastArr[afterNum - 1]);

        String firstResultString = "";

        if(Double.compare(b_dif, a_dif) < 0) {
            firstResultString = "YES";
        } else if (Double.compare(b_dif, a_dif) > 0) {
            firstResultString = "NO";
        }

        int lastRan3 = (int) (Math.random() * 4);
        String answer3 = String.format("%.2f", loastArr[lastRan3]);

        int lastRan4 = (int) (Math.random() * 4);
        String answer4 = String.format("%.2f", hireArr[lastRan4]);

        double max = Double.MIN_VALUE;
        int answer2 = 0;
        for(int i = 0; i < 5; ++i) {
            if(hireArr[i] > max) {
                max = hireArr[i];
                answer2 = i;
            }
        }

        double min = Double.MAX_VALUE;
        int answer22 = 0;
        for(int i = 0; i < 5; ++i) {
            if(hireArr[i] < min) {
                min = hireArr[i];
                answer22 = i;
            }
        }

        String answer2String = thirdArr[answer2];
        String answer22String = thirdArr[answer22];

        double hireMax = Double.MIN_VALUE;
        int hireIndex = 0;
        for(int i = 1; i < hireArr.length; ++i) {
            if (hireArr[i] - hireArr[i - 1] > hireMax) {
                hireMax = hireArr[i] - hireArr[i - 1];
                hireIndex = i;
            }
        }


        System.out.println("1번) 전년도 대비 실업률 변화 차이는 " + beforeYear+ "년 보다 " + afterYear+"년이 더크다? " + firstResultString);
        System.out.println("2번) 고용률이 가장 높은 년도와 가장 낮은 년도는? " + answer2String+"년 / " + answer22String+"년");
        System.out.println("3번) " + thirdArr[lastRan3] + "년의 실업률은? " + answer3 + "%");
        System.out.println("4번) " + thirdArr[lastRan4] + "년의 고용률은? " + answer4 + "%");
        System.out.println("5번) 전년도 대비 고용률의 증가율이 가장 큰 년도는? " + thirdArr[hireIndex] +"년");


        System.out.println("# 비율연습");
        System.out.println("---------------------------비율연습 start------------------------------------");
        int fourRanNum;
        double oneRanNum;


        for(int i = 0; i < 9; ++i) {
            fourRanNum = fourRan();
            oneRanNum = oneRan();
            String result = String.format("%.1f", fourRanNum * (oneRanNum / 10));
            System.out.println(i+1+"번) " + fourRanNum + ", " + oneRanNum / 10 + "% ? " +result );
        }


        System.out.println("---------------------------비율연습 End--------------------------------------");


    }

    private static int fourRan(){
        int ranNum = (int) (Math.random() * 9000 + 1000);
        return ranNum;
    }

    private static int oneRan() {
        int ranNum = (int) (Math.random() * 9 + 1);
        return ranNum;
    }

    private static int ren(int beforeRanOneNum){
        int ranNum = (int) (Math.random() * 3);
        while(beforeRanOneNum == ranNum){
            ranNum = (int) (Math.random() * 3);
        }
        return ranNum;
    }

    private static int ren_last(int beforeRanOneNum){
        int ranNum = (int) (Math.random() * 4 + 1);
        while(beforeRanOneNum == ranNum){
            ranNum = (int) (Math.random() * 4 + 1);
        }
        return ranNum;
    }

    private static int ren_withOut_0(int beforeRanOneNum){
        int ranNum = (int) (Math.random() * 3 + 1);
        while(beforeRanOneNum == ranNum){
            ranNum = (int) (Math.random() * 3 + 1);
        }
        return ranNum;
    }


}
