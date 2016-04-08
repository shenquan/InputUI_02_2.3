package com.example.administrator.inputui_02_23;

import java.util.Scanner;

/**
 * Created by Shenquan Han on 2016/4/7.
 */
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d, sumTime;
        while (scanner.hasNextInt()) {
            Boolean inputError = true;
            d = scanner.nextInt();
            sumTime = scanner.nextInt();
            if (!(d >= 1 && d <= 30)) {
                inputError = false;
            }
            if (!(sumTime >= 0 && sumTime <= 240)) {
                inputError = false;
            }
            int[][] minAndMaxArr = new int[d][2];
            int min = 0, max = 0;//分别记录最小值与最大值之和
            //输入最小值和最大值
            for (int i = 0; i < d; i++) {
                minAndMaxArr[i][0] = scanner.nextInt();
                min += minAndMaxArr[i][0];
                if (!(minAndMaxArr[i][0] >= 0 && minAndMaxArr[i][0] <= 8)) {
                    inputError = false;
                }

                minAndMaxArr[i][1] = scanner.nextInt();
                max += minAndMaxArr[i][1];
                if (!(minAndMaxArr[i][1] >= 0 && minAndMaxArr[i][1] <= 8)) {
                    inputError = false;
                }
                if (minAndMaxArr[i][1] < minAndMaxArr[i][0]) {
                    inputError = false;
                }
            }
            //两种情况直接不满足
            if (min > sumTime || max < sumTime || inputError == false) {
                System.out.println("No");

            } else {
                //判断第三种情况是否满足，若满足则输出Yes，否则输出No
                //先将最小值都加起来，保证每天都有学习进度
                int sumResult = min;
                int[] storeEveryDayData = new int[d];
                for (int i = 0; i < d; i++) {
                    storeEveryDayData[i] = minAndMaxArr[i][0];
                }

                for (int day = 0; day < d; day++) {
                    boolean outFlag = false;
                    //从第二填开始加，每次加1
                    for (int everyDay = minAndMaxArr[day][0]; everyDay < minAndMaxArr[day][1]; everyDay++) {
                        sumResult++;
                        storeEveryDayData[day]++;

                        if (sumResult == sumTime) {
                            outFlag = true;
                            break;
                        }
                    }//内for
                    if (outFlag) {
                        break;
                    }
                }//外for

                if (sumResult == sumTime) {
                    System.out.println("Yes");
                    for (int i = 0; i < d; i++) {
                        if (i == d) {
                            System.out.print(storeEveryDayData[i]);
                        } else {
                            System.out.print(storeEveryDayData[i] + " ");
                        }
                    }
                    //换行，继续输入新数据
                    System.out.println();
                }else {
                    System.out.println("No");
                }
            }//else

        }//while

    }
}
