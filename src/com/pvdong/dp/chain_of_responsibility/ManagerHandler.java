package com.pvdong.dp.chain_of_responsibility;

public class ManagerHandler extends CallHandlerBase {
    @Override
    public PhoneCallResponse response(PhoneCall call) {
        if (status == Status.ONDESK) {
            System.out.println("Call:" + call.toString() + " received by the Manager");
            return PhoneCallResponse.ACCEPTED;
        }
        if (redirectedTo != null) {
            return redirectedTo.response(call);
        }
        return PhoneCallResponse.REJECTED;
    }
}
