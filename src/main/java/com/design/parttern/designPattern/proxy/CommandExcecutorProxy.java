package com.design.parttern.designPattern.proxy;

public class CommandExcecutorProxy implements CommandExcecutor{

    private boolean isAdmin = false;
    private final CommandExcecutor commandExcecutor;
    public CommandExcecutorProxy(String login, String password){
        isAdmin = "bass".equals(login) && "passe".equals(password);
        commandExcecutor = new CommandExcecuteImpl();
    }

    @Override
    public void excecuteCommand(String cmd) throws Exception {
        if(isAdmin){
            commandExcecutor.excecuteCommand(cmd);
        }else{
            if(cmd.contains("rm")){
                throw new Exception("You don't have admin");
            }else{
                commandExcecutor.excecuteCommand(cmd);
            }
        }
    }
}
