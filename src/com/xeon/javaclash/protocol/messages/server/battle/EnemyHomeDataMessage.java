package com.xeon.javaclash.protocol.messages.server.battle;

import com.xeon.javaclash.core.Connection;
import com.xeon.javaclash.protocol.messages.PiranhaMessage;

public class EnemyHomeDataMessage extends PiranhaMessage {
    public EnemyHomeDataMessage(Connection connection){
        super(connection);
        this.id = 24107;
    }

    @Override
    public void encode() {
        writer.writeInt(10);
        writer.writeInt(-1);

        this.connection.player.LogicClientHome(writer); // enemy
        this.connection.player.LogicClientAvatar(writer); // enemy

        this.connection.player.LogicClientAvatar(writer);
        writer.writeInt(3);
        writer.writeInt(0);
        writer.writeInt(0);
    }

}
