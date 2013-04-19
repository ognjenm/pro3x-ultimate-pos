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

package Pro3x.Barcode;

import java.text.NumberFormat;


public class AutoSifra
{

    protected int sekvenca;

    public int getSekvenca()
    {
        return sekvenca;
    }

    private synchronized int sljedeca()
    {
        sekvenca++;
        return sekvenca;
    }

    public void setSekvenca(int sekvenca)
    {
        this.sekvenca = sekvenca;
    }

    public String sljedecaFormatiranaSifra()
    {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumIntegerDigits(5);
        nf.setGroupingUsed(false);

        return nf.format(sljedeca());
    }
}
