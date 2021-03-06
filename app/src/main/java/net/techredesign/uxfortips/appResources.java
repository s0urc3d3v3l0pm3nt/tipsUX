package net.techredesign.uxfortips;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;

/**
 * Created by MatthewElbing on 10/10/15.
 */
public class appResources extends Activity{
    /**
     * THEME REFERENCE:
     *
     * 1 = orange light
     * 2 = orange dark
     * 3 = teal light
     * 4 = teal dark
     * 5 = green light
     * 6 = green dark
     * 7 = red light
     * 8 = red dark
     * 9 = pink light
     * 10 = pink dark
     * 11 = purple light
     * 12 = purple dark
     * 13 = deep purple
     * 14 = deep purple dark
     * 15 = Indigo light
     * 16 = Indigo dark
     */

    /**
     * STATIC
     * @param theme
     * @return themeValue
     * @author Matthew Elbing
     * You can pass in a shared preferance referance
     * IN CALLING CLASS
     *setTheme(appResources.getUserTheme([YOU SHAREDPREFERANCES HERE));
     */
    public static int getUserTheme(int theme){
        if (theme == 1){
            return R.style.orangeTheme;
        }
        else if (theme == 2){
            return R.style.orangeThemeDark;
        }
        else if (theme == 3){
            return R.style.tealTheme;
        }
        else if (theme == 4){
            return R.style.tealThemeDark;
        }
        else if (theme == 5){
            return R.style.greenTheme;
        }
        else if (theme == 6){
            return R.style.greenThemeDark;
        }
        else if (theme == 7){
            return R.style.redTheme;
        }
        else if (theme == 8){
            return R.style.redThemeDark;
        }
        else if (theme == 9){
            return R.style.pinkThemeLight;
        }
        else if (theme == 10){
            return R.style.pinkThemeDark;
        }
        else if (theme == 11){
            return R.style.purpleThemeLight;
        }
        else if (theme == 12){
            return R.style.purpleThemeDark;
        }
        else if (theme == 13){
            return R.style.deepPurpleThemeLight;
        }
        else if (theme == 14){
            return R.style.deepPurpleThemeDark;
        }
        else if (theme == 15){
            return R.style.indigoThemeLight;
        }
        else if (theme == 16){
            return R.style.indigoThemeDark;
        }
        else{
            return R.style.orangeTheme;
        }
    }

    /**
     * @param theme (SharedPreferances.getInt("theme", 0);)
     * @return color referance as int
     *
     * USE: get current themes primary color
     */
    public static int getPrimaryThemeColor(int theme){
        if (theme == 1 || theme == 2){
            return R.color.primaryOrange;
        }
        else if (theme == 3 || theme == 4){
            return R.color.primaryTeal;
        }
        else if (theme == 5 || theme == 6){
            return R.color.primaryGreen;
        }
        else if (theme == 7 || theme == 8){
            return R.color.primaryRed;
        }
        else if (theme == 9 || theme == 10){
            return R.color.primaryPink;
        }
        else if (theme == 11 || theme == 12){
            return R.color.primaryPurple;
        }
        else if (theme == 13 || theme == 14){
            return R.color.primaryDeepPurple;
        }
        else if (theme == 15 || theme == 16){
            return R.color.primaryIndigo;
        }
        else{
            return R.color.primaryOrange;
        }
    }

    /**
     * @param theme
     * @return Accent color as int
     * Gets accent for theme using the SharedPreferances.getInt("theme", 0);
     */
    public static int getPrimaryAccentColor(int theme){
        if (theme == 1){
            return R.color.accentOrange;
        }
        else if (theme == 2){
            return R.color.accentPurple;
        }
        else if (theme == 3){
            return R.color.accentTeal;
        }
        else if (theme == 4){
            return R.color.accentDarkTeal;
        }
        else if (theme == 5){
            return R.color.accentGreen;
        }
        else if (theme == 6){
            return R.color.accentDarkGreen;
        }
        else if (theme == 7){
            return R.color.accentRed;
        }
        else if (theme == 8){
            return R.color.accentDarkRed;
        }
        else if (theme == 9){
            return R.color.accentLightGreen;
        }
        else if (theme == 10){
            return R.color.accentLightGreenDark;
        }
        else if (theme == 11){
            return R.color.accentYellow;
        }
        else if (theme == 12){
            return R.color.accentYellowDark;
        }
        else if (theme == 13){
            return R.color.accentAmber;
        }
        else if (theme == 14){
            return R.color.accentAmberDark;
        }
        else if (theme == 15){
            return R.color.accentOrange;
        }
        else if (theme == 16){
            return R.color.accentOrangeDark;
        }
        else{
            return R.color.accentOrange;
        }
    }
    public static int getThemePrimaryDarkColor(int theme){
        if (theme == 1 || theme == 2){
            return R.color.primaryDarkOrange;
        }
        else if (theme == 3 || theme == 4){
            return R.color.primaryDarkTeal;
        }
        else if (theme == 5 || theme == 6){
            return R.color.primaryDarkGreen;
        }
        else if (theme == 7 || theme == 8){
            return R.color.primaryDarkRed;
        }
        else if (theme == 9 || theme == 10){
            return R.color.primaryPinkDark;
        }
        else if (theme == 11 || theme == 12){
            return R.color.primaryPurpleDark;
        }
        else if (theme == 13 || theme == 14){
            return R.color.primaryDeepPurpleDark;
        }
        else if (theme == 15 || theme == 16){
            return R.color.primaryIndigoDark;
        }
        else{
            return R.color.primaryOrange;
        }
    }
    public static int getThemeAccentDark(int theme){
        if (theme == 1 || theme == 2){
            return R.color.accentPurpleDark;
        }
        else if (theme == 3 || theme == 4){
            return R.color.accentDarkTeal;
        }
        else if (theme == 5 || theme == 6){
            return R.color.accentDarkGreen;
        }
        else if (theme == 7 || theme == 8){
            return R.color.accentDarkRed;
        }
        else if (theme == 9 || theme == 10){
            return R.color.accentLightGreenDark;
        }
        else if (theme == 11 || theme == 12){
            return R.color.accentYellowDark;
        }
        else if (theme == 13 || theme == 14){
            return R.color.accentAmberDark;
        }
        else if (theme == 15 || theme == 16){
            return R.color.accentOrangeDark;
        }
        else{
            return R.color.accentPurpleDark;
        }
    }

}
