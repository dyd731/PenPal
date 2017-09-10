package com.devin.penpal;

public class inData
{
    private int eTime;
    private float ax;
    private float ay;
    private float az;
    private float gx;
    private float gy;
    private float gz;
    private int cpt;

    public inData(int eTime, float ax, float ay, float az, float gx, float gy, float gz, int cpt)
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

    public void seteTime(int eTime)
    {
        this.eTime = eTime;
    }

    public void setAx(float ax)
    {
        this.ax = ax;
    }

    public void setAy(float ay)
    {
        this.ay = ay;
    }

    public void setAz(float az)
    {
        this.az = az;
    }

    public void setGx(float gx)
    {
        this.gx = gx;
    }

    public void setGy(float gy)
    {
        this.gy = gy;
    }

    public void setGz(float gz)
    {
        this.gz = gz;
    }

    public void setCpt(int cpt)
    {
        this.cpt = cpt;
    }

    public float geteTime()
    {
        return eTime;
    }

    public float getAx()
    {
        return ax;
    }

    public float getAy()
    {
        return ay;
    }

    public float getAz()
    {
        return az;
    }

    public float getGx()
    {
        return gx;
    }

    public float getGy()
    {
        return gy;
    }

    public float getGz()
    {
        return gz;
    }

    public int getCpt()
    {
        return cpt;
    }
}
