package cap8;


public class triangulo {
        
    double x,y,z; 
    double area;

    triangulo(){}
    triangulo(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z; 
    }

    public double[] getMetrics() {
        double[] metrics ={this.x,this.y,this.z}; 
        
        
        return metrics;
    }

    public void setMetrics(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z; 
    }


    public void areaCalculator(){
        double p = (x+y+z)/2;
     
        area =  Math.sqrt((p*(p-x)*(p-y)*(p-z)));
    }

    public double getArea(){
        return area; 
    }
}
