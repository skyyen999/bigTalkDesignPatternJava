package c25.mediator;

public class Iraq extends Country {

	public Iraq(UniteNations mediator) {
		super(mediator);
	}
	/**
	 * 放話
	 * @param message
	 */
	public void declare(String message){
		mediator.declare(message, this);
	}
	/**
	 * 接收消息
	 */
	public void getMessage(String message){
		System.out.println("伊拉克獲得對方訊息: " + message);
	}

}
