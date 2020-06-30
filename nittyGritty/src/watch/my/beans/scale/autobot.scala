package watch.my.beans.scale

class autobot 
    ( 
    var label: String,
    var yearsOfUse: Int      = 0,
    var mass: Int,
    var span: Int            
    )
{
    def this(label: String){ this(label,0,0,0) }
    
        
    def useUp = span = span +  1
    
    def setSpan( spanIn: Int) { span = spanIn}
    
    def setMass( massIn: Int) { mass = massIn}


}