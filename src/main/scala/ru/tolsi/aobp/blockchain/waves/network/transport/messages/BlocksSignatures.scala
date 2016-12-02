package ru.tolsi.aobp.blockchain.waves.network.transport.messages

import ru.tolsi.aobp.blockchain.waves.Signature64
import ru.tolsi.aobp.blockchain.waves.network.transport.NetworkMessage

case class BlocksSignatures(signatures: Seq[Signature64]) extends NetworkMessage {
  override def contentId: Byte = 0x15
}
