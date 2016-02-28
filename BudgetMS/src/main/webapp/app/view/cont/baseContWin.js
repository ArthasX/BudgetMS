Ext.define('BudgetMS.view.cont.baseContWin', {
	extend : 'Ext.window.Window',
	title : '请示新增',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.items = contFormItems;
 		this.callParent(arguments);
		this.down('form').getForm().findField('contId').setValue(genContId());
	}
});


var contFormItems = [ {
	xtype : 'form',
	layout : 'auto',
	items : [ {
		xtype : 'textfield',
		name : 'contId',
		fieldLabel : '合同编号',
		 readOnly : true
	}, {
		xtype : 'textfield',
		name : 'contTitle',
		fieldLabel : '合同名称'
	},{
		xtype : 'combo',
		name : 'contType',
		fieldLabel : '合同类型',
		valueField : 'typeId',
		displayField : 'typeName',
		store : {
			fields : [ 'typeId', 'typeName' ],
			data : [ {
				"typeId" : "0",
				"typeName" : "真实合同"
			}, {
				"typeId" : "1",
				"typeName" : "IT服务申请表"
			} ]
		}
	},{
		 
	}, {
		xtype : 'textfield',
		name : 'softAmt',
		fieldLabel : '软件金额',
		vtype : 'money'
	}, {
		xtype : 'textfield',
		name : 'hardAmt',
		fieldLabel : '硬件金额',
		vtype : 'money'
	}, {
		xtype : 'textfield',
		name : 'applyUserName',
		fieldLabel : '申请人'
	}, {
		xtype : 'textfield',
		name : 'remark',
		fieldLabel : '备注'
	} ]
// 上传文件的组件
} ];
