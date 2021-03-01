<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="https://iss.pontagrossa.pr.gov.br" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" targetNamespace="https://iss.pontagrossa.pr.gov.br" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="https://iss.pontagrossa.pr.gov.br">
      <s:element name="RecepcionarLoteRps">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cabecalho" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RecepcionarLoteRpsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="RecepcionarLoteRpsResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RecepcionarLoteRpsSincrono">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cabecalho" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RecepcionarLoteRpsSincronoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="RecepcionarLoteRpsSincronoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CancelarNfse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cabecalho" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CancelarNfseResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CancelarNfseResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SubstituirNfse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cabecalho" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SubstituirNfseResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SubstituirNfseResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GerarNfse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cabecalho" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GerarNfseResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GerarNfseResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarLoteRps">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cabecalho" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarLoteRpsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ConsultarLoteRpsResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarNfsePorRps">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cabecalho" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarNfsePorRpsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ConsultarNfsePorRpsResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarNfseServicoPrestado">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cabecalho" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarNfseServicoPrestadoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ConsultarNfseServicoPrestadoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarNfseServicoTomado">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cabecalho" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarNfseServicoTomadoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ConsultarNfseServicoTomadoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarNfseFaixa">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cabecalho" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarNfseFaixaResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ConsultarNfseFaixaResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="EnviarImportacaoNotasFiscais">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cabecalho" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="EnviarImportacaoNotasFiscaisResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="EnviarImportacaoNotasFiscaisResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarLoteNotasFiscais">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cabecalho" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarLoteNotasFiscaisResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ConsultarLoteNotasFiscaisResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DeclararServicoTomadoAutomatizado">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cabecalho" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DeclararServicoTomadoAutomatizadoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DeclararServicoTomadoAutomatizadoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RecepcionarDeclaracoesSemMovimento">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cabecalho" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RecepcionarDeclaracoesSemMovimentoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="RecepcionarDeclaracoesSemMovimentoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarDeclaracoesSemMovimento">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cabecalho" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarDeclaracoesSemMovimentoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ConsultarDeclaracoesSemMovimentoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarNotasFiscais">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cabecalho" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarNotasFiscaisResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ConsultarNotasFiscaisResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RecepcionarLoteCfse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cabecalho" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RecepcionarLoteCfseResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="RecepcionarLoteCfseResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarDadosCadastro">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cabecalho" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarDadosCadastroResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ConsultarDadosCadastroResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="InformarManutencaoTerminal">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cabecalho" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="InformarManutencaoTerminalResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InformarManutencaoTerminalResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConfigurarTerminal">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cabecalho" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConfigurarTerminalResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ConfigurarTerminalResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarLoteCupom">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cabecalho" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarLoteCupomResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ConsultarLoteCupomResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="InformeTrasmissaoSemMovimento">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cabecalho" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="InformeTrasmissaoSemMovimentoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InformeTrasmissaoSemMovimentoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CancelarCupom">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cabecalho" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CancelarCupomResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CancelarCupomResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RecepcionarLoteCfseSincrono">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cabecalho" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RecepcionarLoteCfseSincronoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="RecepcionarLoteCfseSincronoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarCfse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="cabecalho" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarCfseResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ConsultarCfseResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="RecepcionarLoteRpsSoapIn">
    <wsdl:part name="parameters" element="tns:RecepcionarLoteRps" />
  </wsdl:message>
  <wsdl:message name="RecepcionarLoteRpsSoapOut">
    <wsdl:part name="parameters" element="tns:RecepcionarLoteRpsResponse" />
  </wsdl:message>
  <wsdl:message name="RecepcionarLoteRpsSincronoSoapIn">
    <wsdl:part name="parameters" element="tns:RecepcionarLoteRpsSincrono" />
  </wsdl:message>
  <wsdl:message name="RecepcionarLoteRpsSincronoSoapOut">
    <wsdl:part name="parameters" element="tns:RecepcionarLoteRpsSincronoResponse" />
  </wsdl:message>
  <wsdl:message name="CancelarNfseSoapIn">
    <wsdl:part name="parameters" element="tns:CancelarNfse" />
  </wsdl:message>
  <wsdl:message name="CancelarNfseSoapOut">
    <wsdl:part name="parameters" element="tns:CancelarNfseResponse" />
  </wsdl:message>
  <wsdl:message name="SubstituirNfseSoapIn">
    <wsdl:part name="parameters" element="tns:SubstituirNfse" />
  </wsdl:message>
  <wsdl:message name="SubstituirNfseSoapOut">
    <wsdl:part name="parameters" element="tns:SubstituirNfseResponse" />
  </wsdl:message>
  <wsdl:message name="GerarNfseSoapIn">
    <wsdl:part name="parameters" element="tns:GerarNfse" />
  </wsdl:message>
  <wsdl:message name="GerarNfseSoapOut">
    <wsdl:part name="parameters" element="tns:GerarNfseResponse" />
  </wsdl:message>
  <wsdl:message name="ConsultarLoteRpsSoapIn">
    <wsdl:part name="parameters" element="tns:ConsultarLoteRps" />
  </wsdl:message>
  <wsdl:message name="ConsultarLoteRpsSoapOut">
    <wsdl:part name="parameters" element="tns:ConsultarLoteRpsResponse" />
  </wsdl:message>
  <wsdl:message name="ConsultarNfsePorRpsSoapIn">
    <wsdl:part name="parameters" element="tns:ConsultarNfsePorRps" />
  </wsdl:message>
  <wsdl:message name="ConsultarNfsePorRpsSoapOut">
    <wsdl:part name="parameters" element="tns:ConsultarNfsePorRpsResponse" />
  </wsdl:message>
  <wsdl:message name="ConsultarNfseServicoPrestadoSoapIn">
    <wsdl:part name="parameters" element="tns:ConsultarNfseServicoPrestado" />
  </wsdl:message>
  <wsdl:message name="ConsultarNfseServicoPrestadoSoapOut">
    <wsdl:part name="parameters" element="tns:ConsultarNfseServicoPrestadoResponse" />
  </wsdl:message>
  <wsdl:message name="ConsultarNfseServicoTomadoSoapIn">
    <wsdl:part name="parameters" element="tns:ConsultarNfseServicoTomado" />
  </wsdl:message>
  <wsdl:message name="ConsultarNfseServicoTomadoSoapOut">
    <wsdl:part name="parameters" element="tns:ConsultarNfseServicoTomadoResponse" />
  </wsdl:message>
  <wsdl:message name="ConsultarNfseFaixaSoapIn">
    <wsdl:part name="parameters" element="tns:ConsultarNfseFaixa" />
  </wsdl:message>
  <wsdl:message name="ConsultarNfseFaixaSoapOut">
    <wsdl:part name="parameters" element="tns:ConsultarNfseFaixaResponse" />
  </wsdl:message>
  <wsdl:message name="EnviarImportacaoNotasFiscaisSoapIn">
    <wsdl:part name="parameters" element="tns:EnviarImportacaoNotasFiscais" />
  </wsdl:message>
  <wsdl:message name="EnviarImportacaoNotasFiscaisSoapOut">
    <wsdl:part name="parameters" element="tns:EnviarImportacaoNotasFiscaisResponse" />
  </wsdl:message>
  <wsdl:message name="ConsultarLoteNotasFiscaisSoapIn">
    <wsdl:part name="parameters" element="tns:ConsultarLoteNotasFiscais" />
  </wsdl:message>
  <wsdl:message name="ConsultarLoteNotasFiscaisSoapOut">
    <wsdl:part name="parameters" element="tns:ConsultarLoteNotasFiscaisResponse" />
  </wsdl:message>
  <wsdl:message name="DeclararServicoTomadoAutomatizadoSoapIn">
    <wsdl:part name="parameters" element="tns:DeclararServicoTomadoAutomatizado" />
  </wsdl:message>
  <wsdl:message name="DeclararServicoTomadoAutomatizadoSoapOut">
    <wsdl:part name="parameters" element="tns:DeclararServicoTomadoAutomatizadoResponse" />
  </wsdl:message>
  <wsdl:message name="RecepcionarDeclaracoesSemMovimentoSoapIn">
    <wsdl:part name="parameters" element="tns:RecepcionarDeclaracoesSemMovimento" />
  </wsdl:message>
  <wsdl:message name="RecepcionarDeclaracoesSemMovimentoSoapOut">
    <wsdl:part name="parameters" element="tns:RecepcionarDeclaracoesSemMovimentoResponse" />
  </wsdl:message>
  <wsdl:message name="ConsultarDeclaracoesSemMovimentoSoapIn">
    <wsdl:part name="parameters" element="tns:ConsultarDeclaracoesSemMovimento" />
  </wsdl:message>
  <wsdl:message name="ConsultarDeclaracoesSemMovimentoSoapOut">
    <wsdl:part name="parameters" element="tns:ConsultarDeclaracoesSemMovimentoResponse" />
  </wsdl:message>
  <wsdl:message name="ConsultarNotasFiscaisSoapIn">
    <wsdl:part name="parameters" element="tns:ConsultarNotasFiscais" />
  </wsdl:message>
  <wsdl:message name="ConsultarNotasFiscaisSoapOut">
    <wsdl:part name="parameters" element="tns:ConsultarNotasFiscaisResponse" />
  </wsdl:message>
  <wsdl:message name="RecepcionarLoteCfseSoapIn">
    <wsdl:part name="parameters" element="tns:RecepcionarLoteCfse" />
  </wsdl:message>
  <wsdl:message name="RecepcionarLoteCfseSoapOut">
    <wsdl:part name="parameters" element="tns:RecepcionarLoteCfseResponse" />
  </wsdl:message>
  <wsdl:message name="ConsultarDadosCadastroSoapIn">
    <wsdl:part name="parameters" element="tns:ConsultarDadosCadastro" />
  </wsdl:message>
  <wsdl:message name="ConsultarDadosCadastroSoapOut">
    <wsdl:part name="parameters" element="tns:ConsultarDadosCadastroResponse" />
  </wsdl:message>
  <wsdl:message name="InformarManutencaoTerminalSoapIn">
    <wsdl:part name="parameters" element="tns:InformarManutencaoTerminal" />
  </wsdl:message>
  <wsdl:message name="InformarManutencaoTerminalSoapOut">
    <wsdl:part name="parameters" element="tns:InformarManutencaoTerminalResponse" />
  </wsdl:message>
  <wsdl:message name="ConfigurarTerminalSoapIn">
    <wsdl:part name="parameters" element="tns:ConfigurarTerminal" />
  </wsdl:message>
  <wsdl:message name="ConfigurarTerminalSoapOut">
    <wsdl:part name="parameters" element="tns:ConfigurarTerminalResponse" />
  </wsdl:message>
  <wsdl:message name="ConsultarLoteCupomSoapIn">
    <wsdl:part name="parameters" element="tns:ConsultarLoteCupom" />
  </wsdl:message>
  <wsdl:message name="ConsultarLoteCupomSoapOut">
    <wsdl:part name="parameters" element="tns:ConsultarLoteCupomResponse" />
  </wsdl:message>
  <wsdl:message name="InformeTrasmissaoSemMovimentoSoapIn">
    <wsdl:part name="parameters" element="tns:InformeTrasmissaoSemMovimento" />
  </wsdl:message>
  <wsdl:message name="InformeTrasmissaoSemMovimentoSoapOut">
    <wsdl:part name="parameters" element="tns:InformeTrasmissaoSemMovimentoResponse" />
  </wsdl:message>
  <wsdl:message name="CancelarCupomSoapIn">
    <wsdl:part name="parameters" element="tns:CancelarCupom" />
  </wsdl:message>
  <wsdl:message name="CancelarCupomSoapOut">
    <wsdl:part name="parameters" element="tns:CancelarCupomResponse" />
  </wsdl:message>
  <wsdl:message name="RecepcionarLoteCfseSincronoSoapIn">
    <wsdl:part name="parameters" element="tns:RecepcionarLoteCfseSincrono" />
  </wsdl:message>
  <wsdl:message name="RecepcionarLoteCfseSincronoSoapOut">
    <wsdl:part name="parameters" element="tns:RecepcionarLoteCfseSincronoResponse" />
  </wsdl:message>
  <wsdl:message name="ConsultarCfseSoapIn">
    <wsdl:part name="parameters" element="tns:ConsultarCfse" />
  </wsdl:message>
  <wsdl:message name="ConsultarCfseSoapOut">
    <wsdl:part name="parameters" element="tns:ConsultarCfseResponse" />
  </wsdl:message>
  <wsdl:portType name="ServicesSoap">
    <wsdl:operation name="RecepcionarLoteRps">
      <wsdl:input message="tns:RecepcionarLoteRpsSoapIn" />
      <wsdl:output message="tns:RecepcionarLoteRpsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RecepcionarLoteRpsSincrono">
      <wsdl:input message="tns:RecepcionarLoteRpsSincronoSoapIn" />
      <wsdl:output message="tns:RecepcionarLoteRpsSincronoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CancelarNfse">
      <wsdl:input message="tns:CancelarNfseSoapIn" />
      <wsdl:output message="tns:CancelarNfseSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SubstituirNfse">
      <wsdl:input message="tns:SubstituirNfseSoapIn" />
      <wsdl:output message="tns:SubstituirNfseSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GerarNfse">
      <wsdl:input message="tns:GerarNfseSoapIn" />
      <wsdl:output message="tns:GerarNfseSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ConsultarLoteRps">
      <wsdl:input message="tns:ConsultarLoteRpsSoapIn" />
      <wsdl:output message="tns:ConsultarLoteRpsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ConsultarNfsePorRps">
      <wsdl:input message="tns:ConsultarNfsePorRpsSoapIn" />
      <wsdl:output message="tns:ConsultarNfsePorRpsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ConsultarNfseServicoPrestado">
      <wsdl:input message="tns:ConsultarNfseServicoPrestadoSoapIn" />
      <wsdl:output message="tns:ConsultarNfseServicoPrestadoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ConsultarNfseServicoTomado">
      <wsdl:input message="tns:ConsultarNfseServicoTomadoSoapIn" />
      <wsdl:output message="tns:ConsultarNfseServicoTomadoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ConsultarNfseFaixa">
      <wsdl:input message="tns:ConsultarNfseFaixaSoapIn" />
      <wsdl:output message="tns:ConsultarNfseFaixaSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="EnviarImportacaoNotasFiscais">
      <wsdl:input message="tns:EnviarImportacaoNotasFiscaisSoapIn" />
      <wsdl:output message="tns:EnviarImportacaoNotasFiscaisSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ConsultarLoteNotasFiscais">
      <wsdl:input message="tns:ConsultarLoteNotasFiscaisSoapIn" />
      <wsdl:output message="tns:ConsultarLoteNotasFiscaisSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DeclararServicoTomadoAutomatizado">
      <wsdl:input message="tns:DeclararServicoTomadoAutomatizadoSoapIn" />
      <wsdl:output message="tns:DeclararServicoTomadoAutomatizadoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RecepcionarDeclaracoesSemMovimento">
      <wsdl:input message="tns:RecepcionarDeclaracoesSemMovimentoSoapIn" />
      <wsdl:output message="tns:RecepcionarDeclaracoesSemMovimentoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ConsultarDeclaracoesSemMovimento">
      <wsdl:input message="tns:ConsultarDeclaracoesSemMovimentoSoapIn" />
      <wsdl:output message="tns:ConsultarDeclaracoesSemMovimentoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ConsultarNotasFiscais">
      <wsdl:input message="tns:ConsultarNotasFiscaisSoapIn" />
      <wsdl:output message="tns:ConsultarNotasFiscaisSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RecepcionarLoteCfse">
      <wsdl:input message="tns:RecepcionarLoteCfseSoapIn" />
      <wsdl:output message="tns:RecepcionarLoteCfseSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ConsultarDadosCadastro">
      <wsdl:input message="tns:ConsultarDadosCadastroSoapIn" />
      <wsdl:output message="tns:ConsultarDadosCadastroSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="InformarManutencaoTerminal">
      <wsdl:input message="tns:InformarManutencaoTerminalSoapIn" />
      <wsdl:output message="tns:InformarManutencaoTerminalSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ConfigurarTerminal">
      <wsdl:input message="tns:ConfigurarTerminalSoapIn" />
      <wsdl:output message="tns:ConfigurarTerminalSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ConsultarLoteCupom">
      <wsdl:input message="tns:ConsultarLoteCupomSoapIn" />
      <wsdl:output message="tns:ConsultarLoteCupomSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="InformeTrasmissaoSemMovimento">
      <wsdl:input message="tns:InformeTrasmissaoSemMovimentoSoapIn" />
      <wsdl:output message="tns:InformeTrasmissaoSemMovimentoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CancelarCupom">
      <wsdl:input message="tns:CancelarCupomSoapIn" />
      <wsdl:output message="tns:CancelarCupomSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RecepcionarLoteCfseSincrono">
      <wsdl:input message="tns:RecepcionarLoteCfseSincronoSoapIn" />
      <wsdl:output message="tns:RecepcionarLoteCfseSincronoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ConsultarCfse">
      <wsdl:input message="tns:ConsultarCfseSoapIn" />
      <wsdl:output message="tns:ConsultarCfseSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="ServicesSoap" type="tns:ServicesSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="RecepcionarLoteRps">
      <soap:operation soapAction="https://iss.pontagrossa.pr.gov.br/RecepcionarLoteRps" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RecepcionarLoteRpsSincrono">
      <soap:operation soapAction="https://iss.pontagrossa.pr.gov.br/RecepcionarLoteRpsSincrono" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CancelarNfse">
      <soap:operation soapAction="https://iss.pontagrossa.pr.gov.br/CancelarNfse" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SubstituirNfse">
      <soap:operation soapAction="https://iss.pontagrossa.pr.gov.br/SubstituirNfse" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GerarNfse">
      <soap:operation soapAction="https://iss.pontagrossa.pr.gov.br/GerarNfse" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConsultarLoteRps">
      <soap:operation soapAction="https://iss.pontagrossa.pr.gov.br/ConsultarLoteRps" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConsultarNfsePorRps">
      <soap:operation soapAction="https://iss.pontagrossa.pr.gov.br/ConsultarNfsePorRps" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConsultarNfseServicoPrestado">
      <soap:operation soapAction="https://iss.pontagrossa.pr.gov.br/ConsultarNfseServicoPrestado" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConsultarNfseServicoTomado">
      <soap:operation soapAction="https://iss.pontagrossa.pr.gov.br/ConsultarNfseServicoTomado" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConsultarNfseFaixa">
      <soap:operation soapAction="https://iss.pontagrossa.pr.gov.br/ConsultarNfseFaixa" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="EnviarImportacaoNotasFiscais">
      <soap:operation soapAction="https://iss.pontagrossa.pr.gov.br/EnviarImportacaoNotasFiscais" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConsultarLoteNotasFiscais">
      <soap:operation soapAction="https://iss.pontagrossa.pr.gov.br/ConsultarLoteNotasFiscais" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DeclararServicoTomadoAutomatizado">
      <soap:operation soapAction="https://iss.pontagrossa.pr.gov.br/DeclararServicoTomadoAutomatizado" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RecepcionarDeclaracoesSemMovimento">
      <soap:operation soapAction="https://iss.pontagrossa.pr.gov.br/RecepcionarDeclaracoesSemMovimento" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConsultarDeclaracoesSemMovimento">
      <soap:operation soapAction="https://iss.pontagrossa.pr.gov.br/ConsultarDeclaracoesSemMovimento" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConsultarNotasFiscais">
      <soap:operation soapAction="https://iss.pontagrossa.pr.gov.br/ConsultarNotasFiscais" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RecepcionarLoteCfse">
      <soap:operation soapAction="https://iss.pontagrossa.pr.gov.br/RecepcionarLoteCfse" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConsultarDadosCadastro">
      <soap:operation soapAction="https://iss.pontagrossa.pr.gov.br/ConsultarDadosCadastro" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="InformarManutencaoTerminal">
      <soap:operation soapAction="https://iss.pontagrossa.pr.gov.br/InformarManutencaoTerminal" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConfigurarTerminal">
      <soap:operation soapAction="https://iss.pontagrossa.pr.gov.br/ConfigurarTerminal" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConsultarLoteCupom">
      <soap:operation soapAction="https://iss.pontagrossa.pr.gov.br/ConsultarLoteCupom" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="InformeTrasmissaoSemMovimento">
      <soap:operation soapAction="https://iss.pontagrossa.pr.gov.br/InformeTrasmissaoSemMovimento" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CancelarCupom">
      <soap:operation soapAction="https://iss.pontagrossa.pr.gov.br/CancelarCupom" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RecepcionarLoteCfseSincrono">
      <soap:operation soapAction="https://iss.pontagrossa.pr.gov.br/RecepcionarLoteCfseSincrono" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConsultarCfse">
      <soap:operation soapAction="https://iss.pontagrossa.pr.gov.br/ConsultarCfse" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="ServicesSoap12" type="tns:ServicesSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="RecepcionarLoteRps">
      <soap12:operation soapAction="https://iss.pontagrossa.pr.gov.br/RecepcionarLoteRps" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RecepcionarLoteRpsSincrono">
      <soap12:operation soapAction="https://iss.pontagrossa.pr.gov.br/RecepcionarLoteRpsSincrono" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CancelarNfse">
      <soap12:operation soapAction="https://iss.pontagrossa.pr.gov.br/CancelarNfse" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SubstituirNfse">
      <soap12:operation soapAction="https://iss.pontagrossa.pr.gov.br/SubstituirNfse" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GerarNfse">
      <soap12:operation soapAction="https://iss.pontagrossa.pr.gov.br/GerarNfse" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConsultarLoteRps">
      <soap12:operation soapAction="https://iss.pontagrossa.pr.gov.br/ConsultarLoteRps" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConsultarNfsePorRps">
      <soap12:operation soapAction="https://iss.pontagrossa.pr.gov.br/ConsultarNfsePorRps" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConsultarNfseServicoPrestado">
      <soap12:operation soapAction="https://iss.pontagrossa.pr.gov.br/ConsultarNfseServicoPrestado" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConsultarNfseServicoTomado">
      <soap12:operation soapAction="https://iss.pontagrossa.pr.gov.br/ConsultarNfseServicoTomado" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConsultarNfseFaixa">
      <soap12:operation soapAction="https://iss.pontagrossa.pr.gov.br/ConsultarNfseFaixa" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="EnviarImportacaoNotasFiscais">
      <soap12:operation soapAction="https://iss.pontagrossa.pr.gov.br/EnviarImportacaoNotasFiscais" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConsultarLoteNotasFiscais">
      <soap12:operation soapAction="https://iss.pontagrossa.pr.gov.br/ConsultarLoteNotasFiscais" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DeclararServicoTomadoAutomatizado">
      <soap12:operation soapAction="https://iss.pontagrossa.pr.gov.br/DeclararServicoTomadoAutomatizado" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RecepcionarDeclaracoesSemMovimento">
      <soap12:operation soapAction="https://iss.pontagrossa.pr.gov.br/RecepcionarDeclaracoesSemMovimento" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConsultarDeclaracoesSemMovimento">
      <soap12:operation soapAction="https://iss.pontagrossa.pr.gov.br/ConsultarDeclaracoesSemMovimento" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConsultarNotasFiscais">
      <soap12:operation soapAction="https://iss.pontagrossa.pr.gov.br/ConsultarNotasFiscais" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RecepcionarLoteCfse">
      <soap12:operation soapAction="https://iss.pontagrossa.pr.gov.br/RecepcionarLoteCfse" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConsultarDadosCadastro">
      <soap12:operation soapAction="https://iss.pontagrossa.pr.gov.br/ConsultarDadosCadastro" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="InformarManutencaoTerminal">
      <soap12:operation soapAction="https://iss.pontagrossa.pr.gov.br/InformarManutencaoTerminal" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConfigurarTerminal">
      <soap12:operation soapAction="https://iss.pontagrossa.pr.gov.br/ConfigurarTerminal" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConsultarLoteCupom">
      <soap12:operation soapAction="https://iss.pontagrossa.pr.gov.br/ConsultarLoteCupom" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="InformeTrasmissaoSemMovimento">
      <soap12:operation soapAction="https://iss.pontagrossa.pr.gov.br/InformeTrasmissaoSemMovimento" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CancelarCupom">
      <soap12:operation soapAction="https://iss.pontagrossa.pr.gov.br/CancelarCupom" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RecepcionarLoteCfseSincrono">
      <soap12:operation soapAction="https://iss.pontagrossa.pr.gov.br/RecepcionarLoteCfseSincrono" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConsultarCfse">
      <soap12:operation soapAction="https://iss.pontagrossa.pr.gov.br/ConsultarCfse" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="Services">
    <wsdl:port name="ServicesSoap" binding="tns:ServicesSoap">
      <soap:address location="https://iss.pontagrossa.pr.gov.br:4431/Homologacao/Services.asmx" />
    </wsdl:port>
    <wsdl:port name="ServicesSoap12" binding="tns:ServicesSoap12">
      <soap12:address location="https://iss.pontagrossa.pr.gov.br:4431/Homologacao/Services.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>