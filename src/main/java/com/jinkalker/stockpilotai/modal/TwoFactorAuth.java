package com.jinkalker.stockpilotai.modal;


import com.jinkalker.stockpilotai.domain.VerificationType;
import lombok.Data;

@Data
public class TwoFactorAuth
{
    private boolean isEnabled=false;
    private VerificationType sendTo;

}
