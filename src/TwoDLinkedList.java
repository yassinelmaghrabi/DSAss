public class TwoDLinkedList {
    LinkedList Xheads;
    LinkedList Yheads;
    Node mainNode;
    public TwoDLinkedList(){
        this.mainNode = new Node();
        this.Xheads=new LinkedList();
        this.Yheads=new LinkedList();
    }
    public String yfromx(int key){
        Node currentnode=Xheads.nodefromkey(key);

        StringBuilder stb = new StringBuilder();
        stb.append(key).append(": ");
        while (currentnode!=null){
            System.out.print(currentnode.dataY+" ->");

            stb.append(currentnode.dataY).append(", ");
            currentnode=currentnode.down;
        }
        stb.deleteCharAt(stb.length() - 2);
        System.out.println();
        return stb.toString();
    }
    public String xfromy(int key){
        Node currentnode=Yheads.nodefromkey(key);
        StringBuilder stb = new StringBuilder();
        stb.append(key).append(": ");
        while (currentnode!=null){
            System.out.print(currentnode.dataX+" ->");
            stb.append(currentnode.dataX).append(", ");
            currentnode=currentnode.right;
        }
        stb.deleteCharAt(stb.length() - 2);
        System.out.println();
        return stb.toString();
    }


    public void append(int Xkey,int Ykey){
        Node newNode=new Node(Xkey, Ykey);
        if(mainNode==null || (Xheads.nodefromkey(Xkey)==null && Yheads.nodefromkey(Ykey) == null)){
            mainNode=newNode;
            Xheads.append(newNode, Xkey);
            Yheads.append(newNode, Ykey);
            return;
        }
    
        if(Xheads.nodefromkey(Xkey)==null && Yheads.nodefromkey(Ykey) != null){
            Xheads.append(newNode, Xkey);
            Node yNode=Yheads.nodefromkey(Ykey);
            while(yNode.right!=null){
                yNode=yNode.right;

    
            }
            yNode.right=newNode;

            return;
        }
        if(Yheads.nodefromkey(Ykey)==null && Xheads.nodefromkey(Xkey)!=null){
            Yheads.append(newNode, Ykey);
            Node xNode=Xheads.nodefromkey(Xkey);
            while(xNode.down!=null){
                xNode=xNode.down;
            }

            xNode.down=newNode;
            return;
        }
        if(Yheads.nodefromkey(Ykey)!=null && Xheads.nodefromkey(Xkey)!=null){
            Node yNode=Yheads.nodefromkey(Ykey);
            Node xNode=Xheads.nodefromkey(Xkey);
            
            while(xNode.down!=null){
                
                xNode=xNode.down;
            }
            while(yNode.right!=null){
                
                yNode=yNode.right;
            }
            yNode.right=newNode;
            xNode.down=newNode;

        }
        
        
    
    }
    }