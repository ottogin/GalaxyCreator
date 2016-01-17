package System;

public class Vector2
{
    public double x;
    public double y;


    public Vector2(double x, double y)
    {
        this.x = x;
        this.y = y;

    }

    public Vector2(Vector2 sourceVector)
    {
        x = sourceVector.x;
        y = sourceVector.y;
    }

    public Vector2()
    {
        x = 0;
        y = 0;
    }


    public void SetZero()
    {
        x = 0;
        y = 0;
    }

    public void SetFalse()
    {
        x = -1;
        y = -1;
    }

    public void Normalize()
    {
        double length = (double)Math.sqrt(x*x + y*y);
        x /= length;
        y /= length;
    }

    public void SetValue(Vector2 sourceVector)
    {
        x = sourceVector.x;
        y = sourceVector.y;
    }

    public void SetValue(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public boolean IsFalse()
    {
        return x == -1 && y == -1;
    }

    public boolean IsNegative(boolean useAnd)
    {
        if(useAnd)
            return x < 0 && y < 0;
        else
            return x < 0 || y < 0;
    }

    public double Distance(Vector2 a){
    	return Math.sqrt((a.x - x) * (a.x - x) + (a.y - y) * (a.y - y));
    }
    
    public void ChangeSign()
    {
        x = -x;
        y = -y;
    }

    public boolean Equals(Vector2 vector)
    {
        return Math.abs(x - vector.x) < 0.0001f && Math.abs(y - vector.y) < 0.0001f;
    }

    public void ChangeSign(boolean changeX)
    {
        if(changeX)
            x = -x;
        else
            y = -y;
    }
}
