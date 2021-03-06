package ru.tolsi.aobp.blockchain.waves.network.transport.messages

import ru.tolsi.aobp.blockchain.waves.Signature64
import ru.tolsi.aobp.blockchain.waves.network.transport.NetworkMessage

object Checkpoint {
  final val ContentId: Byte = 0x64
}
case class Checkpoint(checkpoints: Map[Long, Signature64]) extends NetworkMessage {
  override val contentId: Byte = Checkpoint.ContentId
}
