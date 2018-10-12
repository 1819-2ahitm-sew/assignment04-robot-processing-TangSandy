package at.htl.robot.model;

public class Robot {

    private int x = 0;
    private int y = 0;
    private Direction direction = Direction.SOUTH;

    public void rotateLeft(){
        if (this.getDirection() == Direction.SOUTH){
            this.setDirection(Direction.EAST);

        } else if (this.getDirection() == Direction.EAST){
            this.setDirection(Direction.NORTH);
        }

        else if (this.getDirection() == Direction.NORTH){
            this.setDirection(Direction.WEST);
        }

        else if (this.getDirection() == Direction.WEST){
            this.setDirection(Direction.SOUTH);
        }
    }


    public void stepForward(){
        if (this.getDirection() == Direction.SOUTH){
            setY(getY() + 1);

        } else if (this.getDirection() == Direction.EAST){
            setX(getX() + 1);

        } else if (this.getDirection() == Direction.NORTH){
            setY(getY() - 1);

        } else if (this.getDirection() == Direction.WEST){
            setX(getX() - 1);

        }
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}