package Week3.mernis;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.11.5.0
//
// Created by Quasar Development 
//
//----------------------------------------------------

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;



public class HNSStandardDateTimeConverter implements HNSDateTimeConverter
{
    public java.util.TimeZone TimeZone=java.util.TimeZone.getTimeZone("UTC");

    @Override
    public Date convertDateTime(String strDate)
    {
        java.lang.String[] formats = new java.lang.String[] {
                "yyyy-MM-dd'T'HH:mm:ss.SSS",
                "yyyy-MM-dd'T'HH:mm:ss.SSSXXX",
                "yyyy-MM-dd'T'HH:mm:ssZ",
                "yyyy-MM-dd'T'HH:mm:ss",
                "yyyy-MM-dd'T'HH:mm",
                "yyyy-MM-dd"
            };
        return parse(strDate,formats);
    }

    private Date parse(String strDate,java.lang.String[] formats){
        if(strDate==null)
        {
            return null;
        }
        for (java.lang.String frm : formats)
        {
            try
            {
                SimpleDateFormat format = new SimpleDateFormat(frm, Locale.US);
                format.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
                return format.parse(strDate);
            }
            catch (java.lang.Exception ex)
            {
            }
        }
        return null;
    }
    
    @Override
    public Date convertTime(String strDate)
    {
        java.lang.String[] formats = new java.lang.String[] {
                "HH:mm:ss.SSS",
                "HH:mm:ss",
                "HH:mm"
        };
        return parse(strDate,formats);
    }

    @Override
    public Date convertDate(String strDate)
    {
        return convertDateTime(strDate);
    }
    
    @Override
    public String convertDuration(String value) {
        return value;
    }

    @Override
    public String getStringFromDateTime(Date value)
    {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        format.setTimeZone(TimeZone);
        return format.format(value);
    }

    @Override
    public String getStringFromDate(Date value)
    {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        format.setTimeZone(TimeZone);
        return format.format(value);
    }

    @Override
    public String getStringFromTime(Date value)
    {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss", Locale.US);
        format.setTimeZone(TimeZone);
        return format.format(value);
    }

    @Override
    public String getStringFromDuration(String value)
    {
        return value;
    }
}


