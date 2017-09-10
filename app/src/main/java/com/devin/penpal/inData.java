package com.devin.penpal;

public class inData
{
    private String eTime;
    private String ax;
    private String ay;
    private String az;
    private String gx;
    private String gy;
    private String gz;
    private String cpt;

    public inData(String eTime, String ax, String ay, String az, String gx, String gy, String gz, String cpt)
    {
        this.eTime = eTime;
        this.ax = ax;
        this.ay = ay;
        this.az = az;
        this.gx = gx;
        this.gy = gy;
        this.gz = gz;
        this.cpt = cpt;
    }

    public void seteTime(String eTime)
    {
        this.eTime = eTime;
    }

    public void setAx(String ax)
    {
        this.ax = ax;
    }

    public void setAy(String ay)
    {
        this.ay = ay;
    }

    public void setAz(String az)
    {
        this.az = az;
    }

    public void setGx(String gx)
    {
        this.gx = gx;
    }

    public void setGy(String gy)
    {
        this.gy = gy;
    }

    public void setGz(String gz)
    {
        this.gz = gz;
    }

    public void setCpt(String cpt)
    {
        this.cpt = cpt;
    }

    public String geteTime()
    {
        return eTime;
    }

    public String getAx()
    {
        return ax;
    }

    public String getAy()
    {
        return ay;
    }

    public String getAz()
    {
        return az;
    }

    public String getGx()
    {
        return gx;
    }

    public String getGy()
    {
        return gy;
    }

    public String getGz()
    {
        return gz;
    }

    public String getCpt()
    {
        return cpt;
    }
}
