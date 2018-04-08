package com.github.yurivin.blockjane.blockchain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.github.yurivin.blockjane.block.iBlock;
import com.github.yurivin.blockjane.infrastracture.Environment;

import java.util.Map;

public interface iBlockchain {

    /**
     * Method to add block in to blockchain.
     * Should return 'true' if all pending blocks successfully serialized or saved in cash memory.
     * Saving in cache memory may can lead to the loss of blocks when the system falls.
     * If there is some problem with serialization, blockchain works properly,
     * but serializes all pending block when it is possible.
     * @return
     */
    iBlock newBlock() throws JsonProcessingException;

    void setEnvironment(Environment env);
    iBlock getLastBlock();

    /**
     * Method to check the integrity of blockchain
     * @return
     */
    Boolean isCachedChainValid();

    /**
     * Method to add data to new block;
     * @param data
     */
    void addBlockData(Map.Entry<String, JsonNode> data);
}
