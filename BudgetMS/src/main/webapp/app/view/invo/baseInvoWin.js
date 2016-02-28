Ext.define('BudgetMS.view.invo.baseInvoWin', {
	extend : 'Ext.window.Window',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.items = invoFormItems;
		this.callParent(arguments);
	}
});
var invoFormItems = [ {
	xtype : 'form',
	layout : 'auto',
	items : [ {
		xtype : 'textfield',
		name : 'invoId',
		fieldLabel : '请示编号'
	}, {
		xtype : 'textfield',
		name : 'invoTitle',
		fieldLabel : '请示标题'
	}, {
		xtype : 'textarea',
		name : 'invoContent',
		fieldLabel : '请示内容'
	}, {
		xtype : 'combo',
		name : 'invoType',
		fieldLabel : '请示类型',
		valueField : 'typeId',
		displayField : 'typeName',
		store : {
			fields : [ 'typeId', 'typeName' ],
			data : [ {
				"typeId" : "1",
				"typeName" : "一般请示"
			}, {
				"typeId" : "2",
				"typeName" : "IT服务申请表"
			} ]
		}
	}, {
		xtype : 'combo',
		name : 'invoStatus',
		fieldLabel : '请示状态',
		valueField : 'typeId',
		displayField : 'typeName',
		store : {
			fields : [ 'typeId', 'typeName' ],
			data : [ {
				"typeId" : "在途",
				"typeName" : "在途"
			}, {
				"typeId" : "审批结束",
				"typeName" : "审批结束"
			} ]
		}
	}, {
		xtype : 'combo',
		name : 'applyDept',
		fieldLabel : '申请部门',
		valueField : 'deptId',
		displayField : 'deptName',
		allowBlank: false,
		store : {
			fields : [ 'deptId', 'deptName' ],
			data : [ {
				"deptId" : "1",
				"deptName" : "电子银行"
			}, {
				"deptId" : "2",
				"deptName" : "科技管理"
			}, {
				"deptId" : "3",
				"deptName" : "科技开发"
			} ]
		}
	}, {
		xtype : 'textfield',
		name : 'invoAmt',
		fieldLabel : '请示金额',
		vtype : 'money'
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