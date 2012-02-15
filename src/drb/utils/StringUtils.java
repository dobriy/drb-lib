/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package drb.utils;

import drb.Constants.Symbols;

/**
 *
 * @author alexey
 */
public class StringUtils
{

   /**
    * Removes ":", "-" and white spaces from the string and makes it capital;
    * 
    * @param mac
    * @return capitalised string without ":", "-" and spaces
    */public static String trimMac(String mac)
   {
      if (mac != null) {
         String regReplace = "(\\:)|(\\-)|(\\s)";
         mac = mac.replaceAll(regReplace, Symbols.EMPTY_STRING);
         mac = mac.toUpperCase();
      }

      return mac;
   }
}
