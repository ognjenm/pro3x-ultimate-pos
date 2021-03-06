// Pro3x Community project
// Copyright (C) 2009  Aleksandar Zgonjan
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program.  If not, http://www.gnu.org/licenses/gpl.html

package Acosoft.Processing.Components;

import java.util.ArrayList;
import java.util.Date;

public class Pro3xRssInfo
{
    private Date lastRead;
    private ArrayList<Pro3xRssItem> items = new ArrayList<Pro3xRssItem>();
    
    /**
     * @return the lastRead
     */
    public Date getLastRead()
    {
        return lastRead;
    }

    /**
     * @param lastRead the lastRead to set
     */
    public void setLastRead(Date lastRead)
    {
        this.lastRead = lastRead;
    }

    /**
     * @return the items
     */
    public ArrayList<Pro3xRssItem> getItems()
    {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(ArrayList<Pro3xRssItem> items)
    {
        this.items = items;
    }


}
