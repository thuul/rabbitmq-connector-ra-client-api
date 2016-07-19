/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digispherecorp.enterprise.rabbitmq.ra.cci.interatn;

import java.io.Serializable;
import javax.resource.cci.Interaction;

/**
 *
 * @author walle
 *
 * <P>
 * ExtendedInteraction extends the Interaction interface to provide
 * functionality extension by declaring extending AutoClosable to make the
 * implementing classes, auto closable.
 *
 * @see Interaction
 * @see AutoCloseable
 * @see Serializable
 *
 *
 */
public interface ExtendedInteraction extends Interaction, AutoCloseable, Serializable {
}
