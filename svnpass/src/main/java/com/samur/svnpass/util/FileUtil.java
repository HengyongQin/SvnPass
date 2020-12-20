package com.samur.svnpass.util;

import java.io.*;

public class FileUtil {
   /**
    * 读取配置文件
    * @param file
    * @return
    * @throws IOException
    */
   public static String readFile(File file) throws IOException {
      BufferedReader bufferedReader = null;
      StringBuilder builder = new StringBuilder();
      FileReader fileReader = null;

      try {
         fileReader = new FileReader(file);
         bufferedReader = new BufferedReader(fileReader);
         String date;

         while((date = bufferedReader.readLine()) != null) {
            builder.append(date);
         }
      }
      catch(IOException e) {
         e.printStackTrace();
      }
      finally {
         if(bufferedReader != null) {
            bufferedReader.close();
         }

         if(fileReader != null) {
            fileReader.close();
         }

         if(bufferedReader != null) {
            bufferedReader.close();
         }
      }

      return builder.toString();
   }

   /**
    * 读取配置文件
    * @param filePath
    * @return
    * @throws IOException
    */
   public static String readFile(String filePath) {
      File file = new File(filePath);
      String result = null;

      try {
         result = readFile(file);
      }
      catch(IOException e) {
         e.printStackTrace();
      }

      return result;
   }
}
