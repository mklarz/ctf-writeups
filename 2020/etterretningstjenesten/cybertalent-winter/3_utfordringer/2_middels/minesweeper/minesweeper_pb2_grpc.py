# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

import minesweeper_pb2 as minesweeper__pb2


class MinesweeperStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.NewGame = channel.unary_unary(
                '/proto.Minesweeper/NewGame',
                request_serializer=minesweeper__pb2.NewGameRequest.SerializeToString,
                response_deserializer=minesweeper__pb2.NewGameResponse.FromString,
                )
        self.StartLevel = channel.unary_unary(
                '/proto.Minesweeper/StartLevel',
                request_serializer=minesweeper__pb2.StartLevelRequest.SerializeToString,
                response_deserializer=minesweeper__pb2.StartLevelResponse.FromString,
                )
        self.Click = channel.unary_unary(
                '/proto.Minesweeper/Click',
                request_serializer=minesweeper__pb2.ClickRequest.SerializeToString,
                response_deserializer=minesweeper__pb2.ClickResponse.FromString,
                )
        self.SolveLevel = channel.unary_unary(
                '/proto.Minesweeper/SolveLevel',
                request_serializer=minesweeper__pb2.SolveLevelRequest.SerializeToString,
                response_deserializer=minesweeper__pb2.SolveLevelResponse.FromString,
                )


class MinesweeperServicer(object):
    """Missing associated documentation comment in .proto file."""

    def NewGame(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def StartLevel(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Click(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SolveLevel(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MinesweeperServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'NewGame': grpc.unary_unary_rpc_method_handler(
                    servicer.NewGame,
                    request_deserializer=minesweeper__pb2.NewGameRequest.FromString,
                    response_serializer=minesweeper__pb2.NewGameResponse.SerializeToString,
            ),
            'StartLevel': grpc.unary_unary_rpc_method_handler(
                    servicer.StartLevel,
                    request_deserializer=minesweeper__pb2.StartLevelRequest.FromString,
                    response_serializer=minesweeper__pb2.StartLevelResponse.SerializeToString,
            ),
            'Click': grpc.unary_unary_rpc_method_handler(
                    servicer.Click,
                    request_deserializer=minesweeper__pb2.ClickRequest.FromString,
                    response_serializer=minesweeper__pb2.ClickResponse.SerializeToString,
            ),
            'SolveLevel': grpc.unary_unary_rpc_method_handler(
                    servicer.SolveLevel,
                    request_deserializer=minesweeper__pb2.SolveLevelRequest.FromString,
                    response_serializer=minesweeper__pb2.SolveLevelResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'proto.Minesweeper', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Minesweeper(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def NewGame(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/proto.Minesweeper/NewGame',
            minesweeper__pb2.NewGameRequest.SerializeToString,
            minesweeper__pb2.NewGameResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def StartLevel(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/proto.Minesweeper/StartLevel',
            minesweeper__pb2.StartLevelRequest.SerializeToString,
            minesweeper__pb2.StartLevelResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Click(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/proto.Minesweeper/Click',
            minesweeper__pb2.ClickRequest.SerializeToString,
            minesweeper__pb2.ClickResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SolveLevel(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/proto.Minesweeper/SolveLevel',
            minesweeper__pb2.SolveLevelRequest.SerializeToString,
            minesweeper__pb2.SolveLevelResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)