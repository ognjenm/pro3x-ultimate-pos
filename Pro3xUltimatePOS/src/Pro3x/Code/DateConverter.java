/*
 * Pro3x Community project
 * Copyright (C) 2009  Aleksandar Zgonjan
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, http://www.gnu.org/licenses/gpl.html
 * and open the template in the editor.
 */

package Pro3x.Code;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdesktop.beansbinding.Converter;


public class DateConverter extends Converter<Date, String>
{
    private Date datum;
    private SimpleDateFormat sf;

    public DateConverter(String pattern, Date datum)
    {
        this.datum = datum;
        this.sf = new SimpleDateFormat(pattern);
    }

    public DateConverter(String pattern, int addDays)
    {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, addDays);

        this.datum = cal.getTime();
        this.sf = new SimpleDateFormat(pattern);
    }

    @Override
    public String convertForward(Date value)
    {
        if(value == null)
            return "";
        else
            return sf.format(value);
    }

    @Override
    public Date convertReverse(String value)
    {
        try
        {
            return sf.parse(value);
        }
        catch (ParseException ex)
        {
            Logger.getLogger(DateConverter.class.getName()).log(Level.SEVERE, null, ex);
            return datum;
        }
    }

}
